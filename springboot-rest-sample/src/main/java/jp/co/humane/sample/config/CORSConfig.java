package jp.co.humane.sample.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * CORS設定を行う。
 * @author terada
 *
 */
@Configuration
public class CORSConfig {

    /** 開発用プロファイル名 */
    private static final String DEVELOP_PROFILE = "dev";

    /** プロファイル */
    @Value("${spring.profiles}")
    private String profile = null;

    /**
     * CORS設定を行う。
     * @return CORS許可情報。
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {

        final boolean isDev = StringUtils.equals(DEVELOP_PROFILE, profile);
        return new WebMvcConfigurerAdapter() {

            /**
             * 開発時はCORSを無効にする
             */
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                if (isDev) {
                    registry.addMapping("/**");
                }
            }
        };
    }

}
