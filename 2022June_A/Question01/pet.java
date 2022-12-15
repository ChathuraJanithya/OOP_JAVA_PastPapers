public abstract class pet implements PointAllocator {
    private double points;

    
    @Override
    public void setter(double points) {
        this.points = points;
    }
    @Override
    public double getter() {
        return this.points;
    }
    
    public abstract void feed();
    public abstract void clean();
    public abstract void cuddle();
    public abstract void getTotalPoints();
        
    
}
