package Basic;

class FinalizeMethod
{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("This block is exceuted before garbage collection");
    }
}

public class FinalizeDemo {

    public static void main(String[] args) {
        FinalizeMethod fm = new FinalizeMethod();
        fm = null;
        System.gc();
    }
}
