package aquality.appium.mobile.application;

import aquality.appium.mobile.actions.IActionsModule;
import aquality.appium.mobile.actions.ITouchActions;
import aquality.appium.mobile.application.Application;
import aquality.appium.mobile.configuration.*;
import aquality.appium.mobile.elements.IElementsModule;
import aquality.appium.mobile.elements.interfaces.IElementFactory;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.screens.screenfactory.IScreensModule;
import aquality.selenium.core.applications.AqualityModule;
import com.google.inject.Provider;
import com.google.inject.Singleton;

public class MobileModule extends AqualityModule<Application> implements IConfigurationsModule, IElementsModule, IScreensModule, IActionsModule {

    public MobileModule(Provider<Application> applicationProvider) {
        super(applicationProvider);
    }

    @Override
    protected void configure() {
        super.configure();
        bind(IApplicationProfile.class).to(getApplicationProfileImplementation()).in(Singleton.class);
        bind(ILocalServiceSettings.class).to(getLocalServiceSettingsImplementation()).in(Singleton.class);
        bind(IConfiguration.class).to(getConfigurationImplementation());
        bind(IElementFactory.class).to(getElementFactoryImplementation());
        bind(IScreenFactory.class).to(getScreenFactoryImplementation());
        bind(ITouchActionsConfiguration.class).to(getTouchActionsConfigurationImplementation());
        bind(ITouchActions.class).to(getTouchActionsImplementation());
    }
}
