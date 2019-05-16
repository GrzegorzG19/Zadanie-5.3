public class Longer {

    void ifLong(Line lin1, Line lin2){
        if(lin1.odc > lin2.odc){
            System.out.println("odcinek pierwszy jest dłuższy");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin1.start, lin1.end, lin1.odc);
        }
        else if(lin1.odc == lin2.odc)
        {
            System.out.print("odcinki są równe");
            System.out.printf("początek: %d koniec: %d dlugość: %d\n",lin1.start, lin1.end, lin1.odc);
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.start, lin2.end, lin2.odc);
        }
        else{
            System.out.print("odcinek drugi jest dłuższy");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.start, lin2.end, lin2.odc);
        }
    }
}
