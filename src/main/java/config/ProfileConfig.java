package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

//为了说明@Profile的用法
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("test")
    //默认为default环境
//    @Profile("default")
    public DataSource dataSourceForTest() throws ClassNotFoundException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:localhost:3306/test");
        return dataSource;
    }

    @Bean
    @Profile("rel")
    public DataSource dataSourceForRel() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:localhost:3306/rel");
        return dataSource;
    }

    @Bean
    @Profile("pro")
    public DataSource dataSourceForPro() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:localhost:3306/pro");
        return dataSource;
    }
}
