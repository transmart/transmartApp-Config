 /**
 * Configuration for database connection - this file will be loaded 
 * by the tranSMART application when the tomcat is restarted
 */


dataSource {
    driverClassName ="org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/transmart"
    username = "biomart_user"
    password = "biomart_user"
    dialect = "org.hibernate.dialect.PostgreSQLDialect"
}

/*
dataSource {
	driverClassName ="oracle.jdbc.driver.OracleDriver"
	url = "jdbc:oracle:thin:@localhost:1521:xe"
	username = "biomart_user"
	password = "biomart_user"
	dialect = "org.hibernate.dialect.Oracle10gDialect"
	pooled = true
}
*/

hibernate {
	cache.use_second_level_cache=true
	cache.use_query_cache=true
	cache.provider_class='org.hibernate.cache.EhCacheProvider'
	connection.pool_size=30
}

