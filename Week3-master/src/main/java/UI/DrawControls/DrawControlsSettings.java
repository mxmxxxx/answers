package UI.DrawControls;

import UI.DrawControls.LabelledSlider.SliderValue;

// This mutable class holds the values of the draw controls
public class DrawControlsSettings {
    public SliderValue sizeValue=new SliderValue(100);
    public SliderValue redValue=new SliderValue(0);
    public SliderValue greenValue=new SliderValue(0);
    public SliderValue blueValue=new SliderValue(0);
    public String shape="Circle";
}
