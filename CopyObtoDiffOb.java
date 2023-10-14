public class CopyObtoDiffOb
{
    int a=0;
    int b=0;
    public CopyObtoDiffOb()
    {
        a=1;
        b=1;
        
    }
    public CopyObtoDiffOb(int c,int d)
    {
        a=c;
        b=d;
    }
    public void copy(CopyObtoDiffOb ob)
    {
        a=ob.a;
        b=ob.b;
    }
    public void dis()
    {
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
    public static void main()
    {
        CopyObtoDiffOb ob1=new CopyObtoDiffOb();
        CopyObtoDiffOb ob2=new CopyObtoDiffOb(5,6);
        ob1.copy(ob2);//ob1 a=5,b=6
        ob2.copy(ob1);//ob2 a=1,b=1
        ob1.dis();
        ob2.dis();
    }
}