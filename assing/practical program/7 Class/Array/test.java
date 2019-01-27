
class array
{
        private int x[];
        private int size;

        public array()                                          //default constructor
        {
                size=0;
                x=new int[size];
        }

        public array(int x[])                                   //param.constructor
        {
                this.x=x;
                size=x.length;
        }
                                                               //method
        public void display()
        {
                for(int i=0;i<size;i++)
                {
                       System.out.print("\t" + x[i]);
                }
        }

        public void sort()                                    //method
        {
                for(int i=0;i<size;i++)
                {
                        for(int j=i+1;j<size;j++)
                        {
                                if(x[j]>x[j+1])
                                {
                                        int temp;

                                        temp=x[j];
                                        x[j]=x[j+1];
                                        x[j+1]=temp;
                                }
                        }
                }
        }
}



class test                                                        //main method
{
        public static void main(String args[])
        {
                int n[]={10,5,14,15,12};

                array arr=new array(n);

                arr.display();
                arr.sort();
                arr.display();
        }
}
