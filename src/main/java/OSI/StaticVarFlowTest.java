package OSI;


import java.io.IOException;

public class StaticVarFlowTest {


    public void test(String data) throws IOException, InterruptedException{
        Inner inner = new Inner();
        inner.setSuperInner(data);
        doStuff("mkdir", inner);
    }

    private void doStuff(String command, Inner inner){
        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(command+inner.getSuperInner());
        process.waitFor();
    }

    public static class Inner{
        private String superInner;
        public Inner(){
        }

        public void setSuperInner(String superInner){
            this.superInner = superInner;
        }

        public String getSuperInner() {
            return superInner;
        }
    }
}
