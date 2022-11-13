package Box;

public class Box {
    private int length;
    private int width;
    private int height;
    private int test;

    public Box() {

    }

    public Box(int length, int width, int height) {
        if (length < 1 || width < 1 || height < 1) {
            throw new BoxIllegalArgException("Одна из сторо меньше 1");
            }
        this.length = length;
        this.width = width;
        this.height = height;
        }

    public Box(int length, int width, int height,int test) { //try catch обработка исключения
        if (length < 1 || width < 1 || height < 1 || test < 1) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException i) {
                i.printStackTrace();
            }
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.test = test;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length)  {
        if (length < 1) {
            throw new BoxIllegalArgException("Невозможно задать значение меньше чем 1");
        }
            this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calcVolume() {
        int volume = length*width*height;
        return volume;
    }

    @Override
    public String toString() {
        return "Box " +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", test=" + test +
                '.';
    }
}
