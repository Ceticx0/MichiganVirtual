public boolean isInNeighboorhood(Person p) {
    for (Family f : families) {
        if (f.isInFamily(p)) {
            return true;
        }
    }
    return false;
}