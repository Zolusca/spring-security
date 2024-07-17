<center>

### Belajar Spring Security 

</center>

_Note : Silahkan baca-baca di website blog saya [here](https://writelyblog.com)_

---

#### Authorization HttpBasic

1. In Memory Database
    ```java
                @Configuration
        public class SecurityConfigurationApp {
        
            @Bean
            public SecurityFilterChain securityConfig (HttpSecurity httpSecurity) throws Exception {
                return httpSecurity
                        .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                        .authorizeHttpRequests(http->{
                            http.antMatchers(HttpMethod.GET,"/api/v1/book").permitAll();
                            http.antMatchers(HttpMethod.GET,"/api/v1/author").authenticated();
                        })
                        .httpBasic(Customizer.withDefaults())
                        .build();
            }
        
            @Bean
            public UserDetailsService inMemoryUserDetails(){
                UserDetails userDetails = User.builder()
                        .roles("ADMIN")
                        .username("admin")
                        .password(passwordEncoder().encode("admin"))
                        .build();
                return new InMemoryUserDetailsManager(userDetails);
            }
        
            @Bean
            public static PasswordEncoder passwordEncoder(){
                return new BCryptPasswordEncoder();
            }
        }     
    ```
