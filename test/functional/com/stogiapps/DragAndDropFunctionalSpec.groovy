package com.stogiapps

import geb.spock.GebReportingSpec

class DragAndDropFunctionalSpec extends GebReportingSpec {

	def 'Drags and drops with jQuery UI'() {
		when:
		go 'http://jqueryui.com/resources/demos/droppable/default.html'

		and:
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
