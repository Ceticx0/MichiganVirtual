public class Family {
    private ArrayList adults = new ArrayList();
    private ArrayList children = new ArrayList();
    public Family(Person... members) {
        for (Person p : members) {
            if (p.getAge() < 18) {
                children.add(p);
            } else {
                adults.add(p);
            }
        }
    }

    public void add(Person p) {
        if (p.getAge() < 18) {
            children.add(p);
        } else {
            adults.add(p);
        }
    }

    public boolean isInFamily(Person p) {
        if (p.getAge() < 18) {
            for (Person child : children) {
                if (child.matches(p)) {
                    return true;
                }
            }
        } else {
            for (Person adult : adults) {
                if (adult.matches(p)) {
                    return true;
                }
            }
        }
        return false;
    }
}