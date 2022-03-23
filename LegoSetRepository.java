public class LegoSetRepository {
    package brickset;

import repository.Repository;
import  java.lang.String;
    /**
     * Represents a repository of {@code LegoSet} objects.
     */
    public class LegoSetRepository extends Repository<LegoSet> {


        public LegoSetRepository() {
            super(LegoSet.class, "brickset.json");
        }

        /**
         * Returns the number of LEGO sets with the tag specified.
         *
         * @param name a LEGO set name
         * @return the number of LEGO sets with the name
         */
        public long PrintLegoSetsWithName(String name) {
            return getAll().stream()
                    .filter(legoSet -> legoSet.getName() != null && legoSet.getName().contains(name))
                    .count();
        }


        public static void main(String[] args) {
            var repository = new LegoSetRepository();
            System.out.println(repository.PrintLegoSetsWithName("Heart"));
        }
    }
}
