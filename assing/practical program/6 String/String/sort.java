                                /* sorting of string by alphabetically */


class sort
{
        public static void main(String args[])
        {

                String arr[]={"Now","is","the","time","for","all","good","men","to","the","aid","of","their","country"};


                for(int i=0;i<arr.length;i++)
                {
                        for(int j=i+1;j<arr.length;j++)
                        {
                                if(arr[j].compareTo(arr[i])<0)          //comparison is done here
                                {
                                        String s=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=s;
                                }
                        }
                        System.out.println(arr[i]);
                }
                
        }
}
