public class PREVe {
    public static void main(String[] args)
    {
       int result = 1 + 2 ;
       System.out.println(" 1+2 = " + result);
       int previousResult = result;
       result=result-1;
       System.out.println(previousResult+ " -1 = " + result);
        previousResult = result;
       result=result*10;
       System.out.println(previousResult+ "*10 = "+ result );
       previousResult = result;
       result=result/20;
       System.out.println(previousResult+ "/20=" + result);
       previousResult=result;
       result=result%30;
       System.out.println(previousResult+" %30 ="+result);
       previousResult=result;
       result=result+1;
       System.out.println("result is now"+ result);
       result++;
       System.out.println("result is row"+ result);
       result--;
       System.out.println("result is row"+ result);
       result+=2;
       System.out.println("result is row" + result);
       boolean isAlien =false;
       if (isAlien==true)
          System.out.println("It is not an Alien");
       int topscore =80;
       if (topscore < 100)
          System.out.println("You got the high score");
       int secondscore = 81;
       if ((topscore > secondscore)  && (topscore < 100))
       System.out.println("Greater than second top scorer and less then 100");
       if ((topscore> 90) || (secondscore<=90))
          System.out.println("One of these is true");
       int newValue =50;
       if(newValue==50)
          System.out.println("this is true");
       boolean iscar = false;
       if(iscar == true)
          System.out.println("this is not supposed to happen");
       iscar = true;
       boolean wascar = iscar ? true : false;
       if(wascar)
          System.out.println("wascar is trule");
       double myFirstValue = 20d;
       double mySecondValue=80;
       double myTotal=myFirstValue + mySecondValue * 25;
       System.out.println("myTotal  = " + myTotal);
       double theRemainder =myTotal % 40;
       if(theRemainder <=20)
          System.out.println("Total was over the limit");











    }
}
