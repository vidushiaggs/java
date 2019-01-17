class Change
{
    public static void main(String args[]) 
    {
       double minute=7468974
       double mintoyear=60*24*365;
       long years=(long) (minute/mintoyear);
       int dayscount=(int) (minute/60/24)%365;

       
       System.out.println((int) minute + "minutes into years are" +years+"years and "+days+"days" );
       
    }
}

