Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.

  //

  class Solution {
int ans=0;
    public int countSquares(int[][] matrix) {
        int n=matrix.length;

int m=matrix[0].length;
int[][] memo=new int[n][m];

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        ans+=recursion(matrix,i,j,memo);
    }
}
return ans;
    }
public int recursion(int[][] matrix,int i,int j,int[][] memo){
    if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||matrix[i][j]==0) return 0;
if(memo[i][j]!=0){
    return memo[i][j];
}
int l=recursion(matrix,i,j+1,memo),r=recursion(matrix,i+1,j,memo),t=recursion(matrix,i+1,j+1,memo);
ans=1+Math.min(l,Math.min(r,t));
memo[i][j]=ans;
return memo[i][j];
}
}

//Memorozation;
//O(N^2)
//O(N)









lass Solution {
int ans=0;
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
int m=matrix[0].length;
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        ans+=recursion(matrix,i,j);
    }
}
return ans;
    }
public int recursion(int[][] matrix,int i,int j){
    if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||matrix[i][j]==0) return 0;
int l=recursion(matrix,i,j+1),r=recursion(matrix,i+1,j),t=recursion(matrix,i+1,j+1);
ans=1+Math.min(l,Math.min(r,t));
return ans;
}
}

//Recursion problem 
//O(n*m)
