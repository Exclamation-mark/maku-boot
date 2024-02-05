.DEFAULT_GOAL := help
SHELL := /bin/bash
UNAME_S := $(shell uname -s)
SEMVER3 := $(shell cat .version)


db: ## start postgresql and mongodb local
	docker compose up -d
