/***
* transmart Application configuration settings
* this file will be loaded by the tranSMART application when tomcat is restarted
*
*/

/************************
* general configuration items
*************************/

// Default langing page
com.recomdata.defaults.landing = "/datasetExplorer"
// Email address of the administrator to contact
com.recomdata.administrator="admin@example.com"
// Password strength criteria, please change description accordingly
com.recomdata.passwordstrength.pattern = ~/^.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[\d])(?=.*[\W]).*$/
// Password strength description, please change according to pattern
com.recomdata.passwordstrength.description = "It should contain a minimum of 8 characters including at least 1 upper and 1 lower case letter, 1 digit and 1 special character."
// Hide internal tabs including doc and jubilant tabs
com.recomdata.searchtool.hideInternalTabs='false'
// Hide across trial panel
com.recomdata.datasetExplorer.hideAcrossTrialsPanel='false'
// Disable sample explorer
com.recomdata.hideSampleExplorer='false'

/************************
* configuration for search
*************************/

// Lucane index location for documentation search - this is a absolute path on your local deployment
com.recomdata.searchengine.index="/transmart/index"
// contact email address
com.recomdata.searchtool.contactUs="mailto:support@example.com"
// relative context path to dataset explorer url
com.recomdata.searchtool.datasetExplorerURL="/transmart/datasetExplorer"
// absolute path to online help system
com.recomdata.searchtool.adminHelpURL="/transmart/help/adminHelp/default.htm"
// application title
com.recomdata.searchtool.appTitle="Search tranSMART (GPL, PostgresSQL Migration)"
// application logo to be used in the login page
com.recomdata.searchtool.largeLogo="transmartlogo.jpg"
// application logo to be used in the search page
com.recomdata.searchtool.smallLogo="transmartlogosmall.jpg"
// set to true to enable guest auto login.If it's enabled no login is required to access tranSMART.
com.recomdata.guestAutoLogin='false'
// default guest account user name - tranSMART will load this user as the "guest" user account
// This allows tranSMART admin to control the level of accesses a default guest account can have
// or even disable some features if necessary
com.recomdata.guestUserName='guest'

//*************************
//enable genego
//com.recomdata.searchtool.genegoURL='https://portal.genego.com'
//**************************

/**********************************
* configuration for Dataset Explorer
**********************************/
// i2b2 project management cell url
com.recomdata.datasetExplorer.pmServiceURL="http://127.0.0.1:9090/i2b2/rest/PMService/"
// turn proxy on if the pm cell deployed on a different server or not through the apache proxy
com.recomdata.datasetExplorer.pmServiceProxy='true'
// deprecated - leave it as false
com.recomdata.datasetExplorer.inforsense='false'
// set to true to enable gene pattern integration
com.recomdata.datasetExplorer.genePatternEnabled = 'false'
// The tomcat URL that gene pattern is deployed within -usually it's proxyed through apache
com.recomdata.datasetExplorer.genePatternURL='http://127.0.0.1'
// Gene Pattern real URL with port number
com.recomdata.datasetExplorer.genePatternRealURLBehindProxy='http://127.0.0.1:8080'
// default Gene pattern user to start up - each tranSMART user will need a separate user account to be created in Gene Pattern
com.recomdata.datasetExplorer.genePatternUser='biomart'
// temporary image directories for analyses results
com.recomdata.datasetExplorer.imageTempDir='/images/datasetExplorer'
// Absolute path to PLINK executables
com.recomdata.datasetExplorer.plinkExcutable = '/transmart/plink'
// Metadata view
com.recomdata.view.studyview='studydetail'

/**********************************
* configuration for SolR
**********************************/

// solr application URL
com.recomdata.solr.baseURL = 'http://127.0.0.1:8983'
// field list to be indexed from
com.recomdata.solr.solrFieldList = 'Pathology|Tissue|DataType|DataSet'
//This must be in alphabetical order for now.
com.recomdata.solr.resultFields = 'DataSet,DataType,Pathology,Tissue'
//This is the max number of results we retrieve
com.recomdata.solr.maxRows = '1000000'
//This is the number of results we display before drawing the "More [+]" text.
com.recomdata.solr.maxLinksDisplayed = 10
//This is the list of columns we don't draw in the application.
com.recomdata.solr.fieldExclusionList = "text|id|"
//This is the maximum number of news stories we display.
com.recomdata.solr.maxNewsStories = 10
//This is the number of items we display in the search suggestion box.
com.recomdata.solr.numberOfSuggestions = 20


/**********************************************
* configuration for Spring Security Plugin
***********************************************/

// Define providers
// grails.plugin.springsecurity.providerNames = ['ldapAuthProvider','anonymousAuthenticationProvider','rememberMeAuthenticationProvider']

// Address of the LDAP server
grails.plugin.springsecurity.ldap.context.server = 'ldap://auth.example.com'
// DN to authenticate with
grails.plugin.springsecurity.ldap.context.managerDn = 'cn=admin,dc=example,dc=com'
// Password to authenticate with
grails.plugin.springsecurity.ldap.context.managerPassword = 'ChangeMe42'
// Whether or not integrate internal roles. Blurry notion, documentation missing
grails.plugin.springsecurity.ldap.context.allowInternaRoles = 'false'
// Context name to search in, relative to the base of the configured ContextSource, e.g. 'dc=example,dc=com', 'ou=users,dc=example,dc=com'
grails.plugin.springsecurity.ldap.search.base = 'ou=Users,dc=example,dc=com'
// The filter expression used in the user search
grails.plugin.springsecurity.ldap.search.fliter = '(uid={0})'
// Names of attribute ids to return; use null to return all and an empty list to return none
grails.plugin.springsecurity.ldap.authenticator.attributesToReturn = ['uid', 'mail', 'cn']
// The base DN from which the search for group membership should be performed
grails.plugin.springsecurity.ldap.authorities.groupSearchBase = 'ou=server007,ou=Transmart,ou=Applications,dc=example,dc=com'
// The pattern to be used for the user search. {0} is the user's DN
grails.plugin.springsecurity.ldap.authorities.groupSearchFilter = 'memberUid={1}'
// Whether PartialResultExceptions should be ignored in searches, typically used with Active Directory since AD servers often have a problem with referrals
grails.plugin.springsecurity.ldap.authorities.ignorePartialResultException = true
// Whether to infer roles based on group membership
grails.plugin.springsecurity.ldap.authorities.retrieveGroupRoles = true
// Whether to retrieve additional roles from the database using the User/Role many-to-many
grails.plugin.springsecurity.ldap.authorities.retrieveDatabaseRoles = false
// logout url
grails.plugin.springsecurity.logout.afterLogoutUrl='/'
// url to redirect after login in
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/userLanding'
// customized password field. CAUTION WITH LDAP !
grails.plugin.springsecurity.userLookup.passwordPropertyName = 'passwd'
// password encoding url. CAUTION WITH LDAP !
grails.plugin.springsecurity.password.algorithm = 'SHA-1'
// we should force weak hash iteration to comply with existing account. CAUTION WITH LDAP !
grails.plugin.springsecurity.password.hash.iterations = 1


/**********************************************
 * configuration for Quartz jobs
 ***********************************************/

//start delay for the sweep job
com.recomdata.export.jobs.sweep.startDelay=60000 //d*h*m*s*1000
//repeat interval for the sweep job
com.recomdata.export.jobs.sweep.repeatInterval= 86400000 //d*h*m*s*1000
//specify the age of files to be deleted (in days)
com.recomdata.export.jobs.sweep.fileAge=3


/**********************************************
 * configuration for R links
***********************************************/

//This is the directory to the R plugins.
com.recomdata.plugins.pluginScriptDirectory = "/transmart/plugins/"
//This is the main temporary directory, under this should be the folders that get created per job.
com.recomdata.plugins.tempFolderDirectory = "/transmart/jobs/"
//Use this to do local development.  It causes the analysis controllers to move the image file before rendering it.
com.recomdata.plugins.transferImageFile = true
//This is the system path where we move the image file to so we can serve it.
com.recomdata.plugins.temporaryImageFolder = "/transmart/images/tempImages/"
//This is the path that we use to render the image.
com.recomdata.plugins.analysisImageURL = "/transmart/images/tempImages/"
// Path for RScripts
com.recomdata.transmart.data.export.rScriptDirectory='/transmart/export/'


/**********************************************
 * configuration for FacetedSearch SolR
***********************************************/

//Configurations for RWG
com.rwg.solr.scheme = 'http'
com.rwg.solr.host = '146.169.35.170:8983'
com.rwg.solr.path = '/solr-rwg/select/'


/**********************************************
 * configuration for Logger
***********************************************/

log4j = {
    error   'org.codehaus.groovy.grails.web.servlet',        // controllers
            'org.codehaus.groovy.grails.web.pages',          // GSP
            'org.codehaus.groovy.grails.web.sitemesh',       // layouts
            'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
            'org.codehaus.groovy.grails.web.mapping',        // URL mapping
            'org.codehaus.groovy.grails.commons',            // core / classloading
            'org.codehaus.groovy.grails.plugins',            // plugins
            'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
            'org.springframework',
            'org.hibernate',
            'net.sf.ehcache.hibernate'

    warn    'grails.app'

	all     'com.recomdata',
            'org.transmartproject'

	appenders {
		rollingFile name:'tomcatLog', file:"log/transmart.log".toString(), maxFileSize:'50MB', layout:pattern(conversionPattern: '[%p] %d{HH:mm:ss} (%c{5}:%M:%L) | %m%n')
	}

	root {
		info 'StackTrace', 'tomcatLog'
		additivity = true
	}
}


/**********************************************
 * advising transmart for configuration completion
***********************************************/

org.transmart.configFine = true
