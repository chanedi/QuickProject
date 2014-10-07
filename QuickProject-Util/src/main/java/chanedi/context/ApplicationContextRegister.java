package chanedi.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRegister implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		ContextUtils.setApplicationContext(appContext);
	}

}
