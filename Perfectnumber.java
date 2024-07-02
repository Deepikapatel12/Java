class Perfectnumber {
    public boolean checkPerfectNumber(int num) {
         int n=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                n=n+i;
            }
        }
        if(num==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String args[]){
Perfectnumber =;
p.checkPerfectNumber(21);
}
}