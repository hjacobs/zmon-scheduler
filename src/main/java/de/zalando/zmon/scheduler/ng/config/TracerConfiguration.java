package de.zalando.zmon.scheduler.ng.config;

import com.instana.opentracing.InstanaTracer;
import io.opentracing.Tracer;
import io.opentracing.util.ThreadLocalActiveSpanSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ikirichenko on 11.10.17.
 */
@Configuration
public class TracerConfiguration {
    @Bean
    public Tracer instanaTracer() {
        return new InstanaTracer(new ThreadLocalActiveSpanSource());
    }
}
