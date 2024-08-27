import java.io.*;
class file{
    public static void main(String args[])throws FileNotFoundException {
        int ch;
        byte content[]="Anakin is gay".getBytes();
        File f = new File("sample.txt");
        FileOutputStream fo = new FileOutputStream("sample.txt");
        FileInputStream fin = new FileInputStream("sample.txt");
        FileOutputStream fout = new FileOutputStream("new.txt");
        try
        {
            fo.write(content);
            while((ch=fin.read())!=-1)ṇ
            {
                System.out.print((char)ch);
                fout.write(ch);
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println("FileNotFoundException");
        }*/
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally{
            try{
                fin.close();
                fo.close();
                fout.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception has found");
            }
            finally
            {
                System.out.println("");
                System.out.println("file written sucessfully");
            }
        }
    }
}