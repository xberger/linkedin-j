## linkedin-j

### Introduction

__Note:__ This API has been forked from [linkedin-j at GitHub](https://github.com/nabeelmukhtar/linkedin-j).

A Java wrapper for LinkedIn APIs, currently hosted on [Google Code as linkedin-j](http://code.google.com/p/linkedin-j/).

The code is licensed under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).

The code hosted on Google Code has not been updated since Mar 04, 2012, and I have forked an update on GitHub with some additional API return Object implementations.

The code was created by Nabeel Mukhtar and I am just a contributor. Please submit pull requests to add features and fix bugs.

### Usage

The libraries usage has not changed: 

	final LinkedInApiClientFactory factory = LinkedInApiClientFactory.newInstance(consumerKeyValue, consumerSecretValue);
	final LinkedInApiClient client = factory.createLinkedInApiClient(accessTokenValue, tokenSecretValue);
	
	Example:
	
	Connections connections = client.getConnectionsForCurrentUser();
	System.out.println("Total connections fetched:" + connections.getTotal());
	for (Person person : connections.getPersonList()) {
        System.out.println(person.getId() + ":" + person.getFirstName() + " " + person.getLastName() + ":" + person.getHeadline());
	}

__Please note:__ Refer to [Oringinal Wiki](https://code.google.com/p/linkedin-j/wiki/GettingStarted) for further examples. 

### Maven

	<repositories>
		<repository>
			<id>repo.willisju.linkedinj</id>
			<name>Linkedin-J Repo</name>
			<url>https://github.com/willisju/linkedin-j/raw/master/mvn-repo/</url>
		</repository>
	</repositories>
	
    <dependency>
	  <groupId>com.willisju.linkedinj</groupId>
      <artifactId>linkedin-j-core</artifactId>
      <version>1.1</version>
	</dependency>

