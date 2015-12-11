import jenkins.automation.builders.BddSecurityJobBuilder

def projectName ='foo'
new BddSecurityJobBuilder(
        name: "${projectName}-bdd-security-tests",
        description: "Sample bdd security job",
        baseUrl: "http:\\/\\/google.com",
        bddSecurityRepo: "${bddSecurityRepo}",
        chromedriverPath: "\\/Users\\/sotoo\\/homebrew\\/bin\\/Chromedriver"
).build(this);
