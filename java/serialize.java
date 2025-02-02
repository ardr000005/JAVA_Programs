import java.io.*;
class seri
{
    public static void main(String args[])throws IOException,FileNotFoundException,ClassNotFoundException
    {
        byte content[] = "Good Morning all".getBytes();
        File f = new File("sample.txt");
        FileOutputStream fout = new FileOutputStream("sample.txt");
        fout.write(content);
        FileOutputStream fo = new FileOutputStream("text.txt");
        ObjectOutputStream ob = new ObjectOutputStream(fo);
        ob.writeObject("Hello ramesh");
        FileInputStream fin = new FileInputStream("text.txt");
        ObjectInputStream fu = new ObjectInputStream(fin);
        //byte content1=(byte)fu.readObject();
        System.out.println(fu.readObject());

    }
}
