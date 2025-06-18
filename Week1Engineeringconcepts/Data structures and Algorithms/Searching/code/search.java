class Prod {
    String id;
    String name;
    String category;
    double price;

    Prod(String i, String n, String c, double p) {
        id = i;
        name = n;
        category = c;
        price = p;
    }
}

class SimpleSearch {
    static Prod findById(Prod[] products, String id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].id.equals(id)) {
                return products[i];
            }
        }
        return null;
    }

    static Prod[] findByCat(Prod[] products, String category) {
        int count = 0;

        for (Prod p : products) {
            if (p.category.equals(category)) {
                count++;
            }
        }

        Prod[] result = new Prod[count];
        int pos = 0;

        for (Prod p : products) {
            if (p.category.equals(category)) {
                result[pos] = p;
                pos++;
            }
        }

        return result;
    }
}

class FastSearch {
    static Prod find(Prod[] products, String id) {
        int start = 0;
        int end = products.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int check = products[mid].id.compareTo(id);

            if (check == 0) {
                return products[mid];
            } else if (check < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }
}

public class search {
    public static void main(String[] args) {

        Prod[] products = {
                new Prod("P100", "Phone", "Tech", 500),
                new Prod("P200", "Laptop", "Tech", 1000),
                new Prod("P300", "Chair", "Furniture", 50),
                new Prod("P400", "Mug", "Kitchen", 10)
        };

        // linear search
        System.out.println("-- Simple Search --");
        Prod p = SimpleSearch.findById(products, "P200");
        if (p != null) {
            System.out.println("Found product: " + p.name);
        } else {
            System.out.println("Product not found");
        }

        Prod[] techProducts = SimpleSearch.findByCat(products, "Tech");
        System.out.println("Tech products:");
        for (Prod item : techProducts) {
            System.out.println("- " + item.name);
        }

        // binary search
        System.out.println("\n-- Fast Search --");
        java.util.Arrays.sort(products, (a, b) -> a.id.compareTo(b.id));

        Prod found = FastSearch.find(products, "P300");
        if (found != null) {
            System.out.println("Found product: " + found.name);
        } else {
            System.out.println("Product not found");
        }
    }
}

/*
 * output:
 * -- Simple Search --
 * Found product: Laptop
 * Tech products:
 * - Phone
 * - Laptop
 * 
 * -- Fast Search --
 * Found product: Chair
 */
/*
 * Explaination :
 * 1. Algorithm Choices
 * Linear Search: Checks each product one by one
 * Binary Search: Needs sorted data but much faster
 * 2. Time Complexity
 * Linear: O(n) → Slower for big catalogs
 * Binary: O(log n) → Faster but needs sorted data
 * 
 * 3 Best Use Cases
 * Linear: Small lists or multi-field searches
 * Binary: Large catalogs when sorted by ID
 * Real systems: Use HashMaps (O(1) speed)
 * 
 */