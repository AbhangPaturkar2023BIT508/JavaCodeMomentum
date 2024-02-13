class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int countPal = 0;
                  //add code here.
                  for(int i = 0; i < n; i++){
                      int temp = a[i];
                      int palNum = 0;
                      while(temp > 0){
                          int digit = temp % 10;
                          palNum = (palNum * 10 )+digit;
                          temp = temp / 10;
                      }
                      
                      if(palNum == a[i]){
                          countPal++;
                      }
                      
                  }
                  
                 if(countPal == n){
                     return 1;
                 }else{
                     return 0;
                 }
           }
}