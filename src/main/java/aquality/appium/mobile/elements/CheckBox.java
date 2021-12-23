package aquality.appium.mobile.elements;

import aquality.appium.mobile.elements.CheckableElement;
import aquality.appium.mobile.elements.interfaces.ICheckBox;
import aquality.selenium.core.elements.ElementState;
import org.openqa.selenium.By;

/**
 * The class describing the checkbox
 */
public class CheckBox extends CheckableElement implements ICheckBox {

    protected CheckBox(final By locator, final String name, final ElementState state) {
        super(locator, name, state);
    }

    protected String getElementType() {
        return getLocalizationManager().getLocalizedMessage("loc.checkbox");
    }

    @Override
    public void check() {
        setState(true);
    }

    @Override
    public void uncheck() {
        setState(false);
    }

    @Override
    public boolean isChecked() {
        logElementAction("loc.checkbox.get.state");
        return super.isChecked();
    }

    @Override
    public void toggle() {
        setState(!super.isChecked());
    }

    /**
     * Set value
     *
     * @param state value (true/false)
     */
    private void setState(boolean state) {
        logElementAction("loc.setting.value", state);
        if (state != super.isChecked()) {
            click();
        }
    }
}
