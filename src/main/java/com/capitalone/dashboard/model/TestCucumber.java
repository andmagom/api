package com.capitalone.dashboard.model;

public class TestCucumber {


    private String line;

    private Elements[] elements;

    private String name;

    private String description;

    private String id;

    private String keyword;

    private String uri;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Elements[] getElements() {
        return elements;
    }

    public void setElements(Elements[] elements) {
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Features [line = " + line + ", elements = " + elements + ", name = " + name + ", description = " + description + ", id = " + id + ", keyword = " + keyword + ", uri = " + uri + "]";
    }


    public static class Elements {
        private Comments[] comments;

        private Before[] before;

        private String line;

        private String name;

        private String description;

        private String id;

        private After[] after;

        private String keyword;

        private String type;

        private Steps[] steps;

        private Tags[] tags;

        public Comments[] getComments() {
            return comments;
        }

        public void setComments(Comments[] comments) {
            this.comments = comments;
        }

        public Before[] getBefore() {
            return before;
        }

        public void setBefore(Before[] before) {
            this.before = before;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public After[] getAfter() {
            return after;
        }

        public void setAfter(After[] after) {
            this.after = after;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Steps[] getSteps() {
            return steps;
        }

        public void setSteps(Steps[] steps) {
            this.steps = steps;
        }

        public Tags[] getTags() {
            return tags;
        }

        public void setTags(Tags[] tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "Elements [comments = " + comments + ", before = " + before + ", line = " + line + ", name = " + name + ", description = " + description + ", id = " + id + ", after = " + after + ", keyword = " + keyword + ", type = " + type + ", steps = " + steps + ", tags = " + tags + "]";
        }
    }

    public static class After {
        private Result result;

        private Match match;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public Match getMatch() {
            return match;
        }

        public void setMatch(Match match) {
            this.match = match;
        }

        @Override
        public String toString() {
            return "After [result = " + result + ", match = " + match + "]";
        }
    }


    public static class Steps {
        private Result result;

        private String line;

        private String name;

        private Match match;

        private String keyword;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Match getMatch() {
            return match;
        }

        public void setMatch(Match match) {
            this.match = match;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        @Override
        public String toString() {
            return "Steps [result = " + result + ", line = " + line + ", name = " + name + ", match = " + match + ", keyword = " + keyword + "]";
        }
    }

    public static class Match {
        private String location;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "Match [location = " + location + "]";
        }
    }


    public static class Before {
        private Result result;

        private Match match;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public Match getMatch() {
            return match;
        }

        public void setMatch(Match match) {
            this.match = match;
        }

        @Override
        public String toString() {
            return "Before [result = " + result + ", match = " + match + "]";
        }
    }

    public static class Result {
        private String duration;

        private String status;

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Result [duration = " + duration + ", status = " + status + "]";
        }
    }


    public static class Comments {
        private String line;

        private String value;

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Comments [line = " + line + ", value = " + value + "]";
        }
    }

    public static class Tags {
        private String line;

        private String name;

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Tags [line = " + line + ", name = " + name + "]";
        }
    }


}
