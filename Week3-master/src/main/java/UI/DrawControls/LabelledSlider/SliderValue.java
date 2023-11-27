package UI.DrawControls.LabelledSlider;

public class SliderValue {
    // UI.LabelledSliderPanel.SliderValue is a class that holds a single integer value and is mutable so that the value can be changed by the front end
    private int value;
    public SliderValue(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
