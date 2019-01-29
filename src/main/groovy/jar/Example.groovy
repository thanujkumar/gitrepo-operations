//
// Generated from archetype; please customize.
//

package jar

import groovy.json.*

/**
 * Example Groovy class.
 */
class Example
{
	def show() {
		String base = 'http://api.icndb.com/jokes/random?'
		def qs = [limiTo:'[nerdy]', firstName: 'Guillaume',
			lastName: 'Laforge'].collect {k,v ->"$k=$v"}.join('&')
		String jsonTxt = "$base$qs".toURL().text
		def json = new JsonSlurper().parseText(jsonTxt)
		println json.value.joke
	}
}
