class Main
{
  public static void main(String args[])
  {
    int n=10;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-1;j++)
      {
        if(j==0 || i==j)
        System.out.print("* ");
        else
        System.out.print("  ");
      }
      System.out.println();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(j==0 || i==j || j==n-1 ||i+j==n-1 || i==n/2)
        System.out.print("* ");
        else
        System.out.print("  ");
      }
      System.out.println();
    }
  }
}