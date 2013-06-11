package com.stogiapps

import geb.spock.GebReportingSpec

class SimpleFunctionalSpec extends GebReportingSpec {

	def 'Main page is accessible'() {
		when:
		go 'http://localhost:8080/braindump'

		then:
		title == 'Braindump'
	}

}
