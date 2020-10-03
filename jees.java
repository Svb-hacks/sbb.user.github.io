#include <iostream>
#include <string>

/* only lowercase alphabetical passwords are shown by the program    */

using namespace std;
    
int main()
{
    string password;
    string generatedPass;
    cin >> password;
    char digArray[]={'a'-1,'a','a','a','a','a','a','a','a','a'};
    
    for(int m=0;password[m]!='\0';m++)
    {
        if((password[m]>=65 && password[m]<=(65+25)) || (password[m]>=97 && password[m]<=(97+25)));
        else
        {
            cout<<"\nEnter Alphabetical pwd";
            return 1;
        }
    }
    
     while( password.compare(generatedPass) != 0 )
    {
      digArray[0]++;
      for(int x=0;x<password.length();x++)
      {
       if(digArray[x]=='z'+1)
        {
          digArray[x] = 'a';
          digArray[x + 1]++;
        }
      }
      
    generatedPass=digArray[password.length()-1];
    for(int i=password.length()-2;i>=0; i--)
          generatedPass+=digArray[i];
     }       
       
    
    cout <<"Password is:\t"<<generatedPass << endl;
    cout<<"!!!!!PLEASE LIKE IT!!!!!!";
    return 0;
    
}