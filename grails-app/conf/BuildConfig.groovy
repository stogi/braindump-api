grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
	inherits 'global'
	log 'error'
	checksums true
	legacyResolve false

	repositories {
		inherits true

		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()
	}

	def gebVersion = '0.9.0'
	def seleniumVersion = '2.33.0'

	dependencies {
		test "org.gebish:geb-spock:$gebVersion"
		test "org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion"
		test "org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion"
		test "org.seleniumhq.selenium:selenium-support:$seleniumVersion"
		test 'org.spockframework:spock-grails-support:0.7-groovy-2.0'
	}

	plugins {
		build ":tomcat:$grailsVersion"

		compile ':cache:1.0.1'

		runtime ":database-migration:1.3.2"
		runtime ":hibernate:$grailsVersion"

		test ":geb:$gebVersion"
		test(':spock:0.7') {
			exclude 'spock-grails-support'
		}
	}
}
