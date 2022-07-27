public boolean isSubset(int[] arr,int sum){
if(arr.length==0)return false;
boolean[][] mat=new boolean[arr.length][sum];
for(int i=0;i<arr.length;i++){
mat[i][0]=true;

}
for(int i=0;i<=sum;i++){
if(j==arr[0])
mat[0][j]=true;
}
for(int i=1;i<arr.length;i++){
for(int j=1;j<=sum;j++){
if(mat[i-1][j]==true){
mat[i][j]=true;
}else{
if(j>=arr[i]){
mat[i][j]=mat[i-1][j-arr[i]];
}
}
}
}
return mat[arr.length-1][sum];
}


//O(N*Sum)
//O(N*Sum)
