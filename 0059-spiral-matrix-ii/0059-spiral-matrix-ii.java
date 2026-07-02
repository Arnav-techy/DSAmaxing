class Solution {
    public int[][] generateMatrix(int n) {
        int [][] a=new int [n][n];
        int up=0; 
        int down=1; 
        int right=2; 
        int left=3;

        int up_wall=0;
        int right_wall=n;
        int left_wall=-1;
        int down_wall=n;

        int direction=right;
        int ans=1;
        int i=0;
        int j=0;

        while(ans<=n*n){
           
            if (direction==right){
                while(j<right_wall){
                    a[i][j]=ans;
                    ans++;
                    j++;
                }
                i=i+1;
                j=j-1;
                right_wall-=1;
                direction=down;
            }
            else if(direction==down){
                while(i<down_wall){
                    a[i][j]=ans;
                    ans++;
                    i++;
                }
                i-=1;
                j-=1;
                down_wall-=1;
                direction=left;
            }
            else if(direction==left){
                while(j>left_wall){
                    a[i][j]=ans;
                    ans++;
                    j--;
                }
                i-=1;
                j+=1;
                left_wall+=1;
                direction=up;
            }
            else if(direction==up){
                while(i>up_wall){
                    a[i][j]=ans;
                    ans++;
                    i--;
                }
                i+=1;
                j+=1;
                up_wall+=1;
                direction=right;
            }
        }
        return a;

        
        
    }
}