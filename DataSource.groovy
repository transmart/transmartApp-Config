 /**
 * Configuration for database connection - this file will be loaded 
 * by the tranSMART application when the tomcat is restarted
 */

dataSource {
	// pooled connection
	pooled = true
	// standard jdbc driver
	driverClassName ="oracle.jdbc.driver.OracleDriver"
	// oracle jdbc url- example here is connecting to an oracle xe instance on localhost 
        url = "jdbc:oracle:thin:@23.23.185.167:1521:pgdev"
	// user name and password
	username = "biomart_user"
	password = "biomart_user"
	// hibernate database connection dialect
	dialect = "org.hibernate.dialect.Oracle10gDialect"
	// enable this for SQL debugging 
        //loggingSql = true
}

dataSource_postgresql {

            driverClassName ="org.postgresql.Driver"         

            url = "jdbc:postgresql://localhost:5432/transmart"             // AWS GPL Database

            username = "biomart_user"

            password = "biomart_user"

            dialect = "org.hibernate.dialect.PostgreSQLDialect"

            //loggingSql = true

            //formatSql = true

}


hibernate {
	// hibernate cache config
	cache.use_second_level_cache=true
	//turn on query cache
	cache.use_query_cache=true
	cache.provider_class='org.hibernate.cache.EhCacheProvider'
	// pool size
	connection.pool_size=30
}

