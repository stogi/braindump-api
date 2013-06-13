package com.stogiapps

import geb.spock.GebReportingSpec

class DragAndDropFunctionalSpec extends GebReportingSpec {

	def 'Main page is accessible'() {
		when:
		go 'http://jqueryui.com/resources/demos/droppable/default.html'

		then:
		sleep 2000

		when:
		def draggable = $('#draggable')
		def droppable = $('#droppable')

		interact {
			dragAndDrop draggable, droppable
		}

		then:
		sleep 10000
		false
	}

}
