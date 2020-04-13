package it.indoor.navigation.frontend.config;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author pasqualecozzupoli
 *
 */
public class WebConfig implements WebMvcConfigurer {

	@Bean
	ErrorViewResolver supportPathBasedLocationStrategyWithoutHashes() {
		return (HttpServletRequest request, HttpStatus status,
				Map<String, Object> model) -> status == HttpStatus.NOT_FOUND
						? new ModelAndView("index.html", Collections.emptyMap(), HttpStatus.OK)
						: null;
	}

}
