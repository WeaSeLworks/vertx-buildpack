import groovy.json.JsonSlurper;
def jsonText = args[0]
def attr = args[1]
def json = new JsonSlurper().parseText(jsonText);
println json[attr]