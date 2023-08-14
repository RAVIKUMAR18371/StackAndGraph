public class Travelling_person {
   // int max = 999999;

  static  int n = 4;
   static int[][] distance = { {0,20,42,25},
                               {20,0,30,34},
                               {42,30,0,10},
                               {25,34,10,0}
    };

    //if all the cities have been visited

   static int VISITED_ALL = (1<<n) - 1;

        // mask--> the set of cities which have been visited so far, so from
        //         mask we come to know that which cities have not been visited
        // pos---> the position of the current cities or from which city I am going
        //         to the next city.

   static int Tsp(int mask, int pos){
        if(mask == VISITED_ALL){ // Base condition
            return distance[pos][0];
        }
        int Ans = Integer.MAX_VALUE;

  // try to go to the unvisited city
        for(int city = 0; city < n; city++){
            if((mask & (1<<city)) == 0){
                int newAns = distance[pos][city] + Tsp(mask|(1<<city),city);

                Ans = Math.min(Ans , newAns);
            }
        }
        return Ans;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("The minimum travelling cost will be "+Tsp(1,0));
        // 1--->denotes the initial "mask" = 0001
        // pos--> denotes the 0th city have been visited initially.

    }

}
