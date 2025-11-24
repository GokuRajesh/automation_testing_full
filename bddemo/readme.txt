plugin = { "pretty" },
monochrome = true)

plugin = { "usage" },
	monochrome = true


plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)

plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
	monochrome = true

plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
	monochrome = true
