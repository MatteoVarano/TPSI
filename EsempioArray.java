import java.io.*;
public class EsempioArray
{
public static void main(String args[]) throws NumberFormatException, IOException
{
int i=0;
int v[]=new int[10];
InputStreamReader In = new InputStreamReader(System.in);
BufferedReader Tastiera = new BufferedReader(In);
for (i=0; i<10; i++)
{
System.out.print("Valore: v["+i+"]= ");
v[i]=Integer.parseInt(Tastiera.readLine());
}
for(i=0; i<10;i++)
{
System.out.println("v["+i+"]="+v[i]);
}
int S=0;
for(i=0; i<10;i++)
{
S=S+v[i];
}
System.out.println("somma="+S);
}
}