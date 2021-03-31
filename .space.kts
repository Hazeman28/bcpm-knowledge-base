/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Deploy to GitHub pages") {
    container(displayName = "Deploy", image = "ubuntu") {
    	shellScript {
        	interpreter = "/bin/bash"
            location = "./deploy.sh"
        }
        
        startOn {
        	gitPush {
            	branchFilter {
                	"refs/heads/release"
                }
            }
        }
    }
}
