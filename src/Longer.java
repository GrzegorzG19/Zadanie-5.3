public class Longer {

    Line ifLong(Line lin1, Line lin2){

        int odc1 = lin1.p2.start - lin1.p1.start;
        int odc2 = lin2.p2.start - lin1.p1.start;

        if(odc1 > odc2){
            System.out.println("odcinek pierwszy jest dłuższy");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin1.p1.start, lin1.p2.start, odc1);
            return lin1;
        }
        else if(odc1 == odc2)
        {
            System.out.print("odcinki są równe");
            System.out.printf("początek: %d koniec: %d dlugość: %d\n",lin1.p1.start, lin1.p2.start, odc1);
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.p1.start, lin2.p2.start, odc2);
            return lin1;

        }
        else{
            System.out.print("odcinek drugi jest dłuższy\n");
            System.out.printf("początek: %d koniec: %d dlugość: %d",lin2.p1.start, lin2.p2.start, odc1  );
            return lin2;
        }
    }
}
