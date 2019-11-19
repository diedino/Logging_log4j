package app;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Plugin(
        name = "MapAppender",
        category = Core.CATEGORY_NAME,
        elementType = Appender.ELEMENT_TYPE)
public class VasiliyAppender extends AbstractAppender {

    private ConcurrentMap<String, LogEvent> eventMap = new ConcurrentHashMap<>();

    protected VasiliyAppender(String name, Filter filter) {
        super(name, filter, null);
    }

    @PluginFactory
    public static VasiliyAppender createAppender(
            @PluginAttribute("name") String name,
            @PluginElement("Filter") Filter filter) {
        return new VasiliyAppender(name, filter);
    }

    @Override
    public void append(LogEvent logEvent) {
        if (logEvent.getLevel().isLessSpecificThan(Level.DEBUG)) {
            error("Unable to log less than WARN level.");
            return;
        }
        eventMap.put(Instant.now().toString(), logEvent);
        System.out.println("eventMapSize: "+eventMap.size()+" || "
                +"LoggerName: "+logEvent.getLoggerName()+" || "
                +"SourceName: "+logEvent.getSource());
    }

    public ConcurrentMap<String, LogEvent> getEventMap() {
        return eventMap;
    }

    public void setEventMap(ConcurrentMap<String, LogEvent> eventMap) {
        this.eventMap = eventMap;
    }
}
