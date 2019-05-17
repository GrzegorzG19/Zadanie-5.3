public class Longer {

    void ifLong(Line lin1, Line lin2){
        if(lin1.odc > lin2.odc){
            System.out.println("odcinek pierwszy jest dłuższy");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin1.p1.start, lin1.p2.start, lin1.odc);
        }
        else if(lin1.odc == lin2.odc)
        {
            System.out.print("odcinki są równe");
            System.out.printf("początek: %d koniec: %d dlugość: %d\n",lin1.p1.start, lin1.p2.start, lin1.odc);
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.p1.start, lin2.p2.start, lin2.odc);
        }
        else{
            System.out.print("odcinek drugi jest dłuższy\n");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.p1.start, lin2.p2.start, lin2.odc);
        }
    }
}
