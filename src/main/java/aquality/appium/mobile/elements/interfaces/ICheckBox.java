package aquality.appium.mobile.elements.interfaces;

import aquality.appium.mobile.elements.interfaces.IElement;

public interface ICheckBox extends IElement {
    /**
     * set true
     */
    void check();

    /**
     * Get the value of the checkbox (true / false)
     * @return true if is checked, false otherwise
     */
    boolean isChecked();

    /**
     * reverse state
     */
    void toggle();

    /**
     * Set the checkbox to false
     */
    void uncheck();
}
